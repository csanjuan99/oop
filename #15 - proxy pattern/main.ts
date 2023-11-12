import mongoose, { ConnectionOptions, Connection } from 'mongoose';

// Interfaz para la conexión a la base de datos
interface DatabaseConnection {
    connect(): Promise<Connection>;
    disconnect(): Promise<void>;
}

// Implementación concreta de la conexión a MongoDB
class RealDatabaseConnection implements DatabaseConnection {
    private readonly dbUri: string;
    private isConnected: boolean;

    constructor(dbUri: string) {
        this.dbUri = dbUri;
        this.isConnected = false;
    }

    async connect(): Promise<Connection> {
        if (!this.isConnected) {
            await mongoose.connect(this.dbUri, { useNewUrlParser: true, useUnifiedTopology: true } as ConnectionOptions);
            this.isConnected = true;
        }
        return mongoose.connection;
    }

    async disconnect(): Promise<void> {
        if (this.isConnected) {
            await mongoose.disconnect();
            this.isConnected = false;
        }
    }
}

// Proxy para la conexión a la base de datos con capacidad de caché
class CachedDatabaseConnection implements DatabaseConnection {
    private realConnection: RealDatabaseConnection | null = null;

    async connect(): Promise<Connection> {
        if (!this.realConnection) {
            this.realConnection = new RealDatabaseConnection('tu_url_de_conexion_mongo');
        }
        return this.realConnection.connect();
    }

    async disconnect(): Promise<void> {
        if (this.realConnection) {
            return this.realConnection.disconnect();
        }
    }
}

// Clase que utiliza la conexión a la base de datos a través del proxy
class DatabaseManager {
    private service: DatabaseConnection;

    constructor(service: DatabaseConnection) {
        this.service = service;
    }

    async performDatabaseOperations() {
        // Conectar a la base de datos
        const dbConnection = await this.service.connect();
        console.log('Conectado a la base de datos');

        // Realizar operaciones en la base de datos (ejemplo: consultas, actualizaciones, etc.)
        // ...

        // Desconectar de la base de datos
        await this.service.disconnect();
        console.log('Desconectado de la base de datos');
    }
}

// Uso del Proxy para gestionar la conexión a la base de datos
async function runExample() {
    const databaseProxy = new CachedDatabaseConnection();
    const databaseManager = new DatabaseManager(databaseProxy);

    // Realizar operaciones en la base de datos a través del proxy
    await databaseManager.performDatabaseOperations();
}

// Ejecutar el ejemplo
runExample();
