package springboot_cassandra_integration.springboot_cassandra_integration;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}
