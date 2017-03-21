import java.sql.*;

class conntest{
    public static void main(String[] args){
        String connstr = ""; String user = ""; String pass = "";
        if(args != null && args.length == 3){
            connstr = args[0];
            user = args[1];
            pass = args[2];
        } else {
            connstr = "";
            user = "";
            pass = "";
        }
        if(connstr == "" || (args != null && args.length > 0 && args.length != 3)){
            System.out.println("usage: java conntest <connection_string> <username> <password>");
            System.exit(0);
        }

      	System.out.println("Connecting to " + connstr);
        try{
            Connection conn = DriverManager.getConnection(connstr, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DUAL");
            conn.close();
            System.out.println("Connection successful");
            System.exit(0);

        } catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
