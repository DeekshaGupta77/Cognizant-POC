import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class CassandraConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String serverIp = "10.0.0.7";
	    String keyspace = "MyCassandra";
	    CassandraConnection connection;

	    Cluster cluster = Cluster.builder()
	            .addContactPoints(serverIp)
	            .build();

	    Session session = cluster.connect(keyspace);


	    String cqlStatement = "SELECT * FROM TestCF";
	    for (Row row : session.execute(cqlStatement)) {
	        System.out.println(row.toString());
	    }

	}

	}


