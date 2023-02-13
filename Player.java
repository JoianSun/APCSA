public class Player {
    // Private variables
    private static int numPlayers;
    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;
    
    // Constructors
    public Player() {
        numPlayers++;
        this.name = "P" + numPlayers;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.hp = 20;
        this.direction = 1;
    }
    
    public Player(String name, int x, int y, int z) {
        numPlayers++;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = 20;
        this.direction = 1;
    }
    
    public Player(String name, int x, int y, int z, int health, int direction) {
        numPlayers++;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = (health < 0) ? 0 : health;
        this.direction = (direction < 1 || direction > 6) ? 1 : direction;
    }
    
    // Accessors
    public static int getNumPlayers() {
        return numPlayers;
    }
    
    public String getName() {
        return name;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getZ() {
        return z;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public String toString() {
        return "Name: " + name + "\nHealth: " + hp + "\nCoordinates: X " + x + " Y " + y + " Z " + z + "\nDirection: " + direction;
    }
    
    // Mutators
    public void setHp(int hp) {
        this.hp = (hp < 0) ? 0 : hp;
    }
    
    public void setDirection(int direction) {
        if (direction >= 1 && direction <= 6) {
            this.direction = direction;
        }
    }
    
    public void move(int direction, int units) {
        switch (direction) {
            case 1:
                x += units;
                break;
            case 2:
                x -= units;
                break;
            case 3:
                y += units;
                break;
            case 4:
                y -= units;
                break;
            case 5:
                z += units;
                break;
            case 6:
                z -= units;
                break;
        }
    }
    
    public void teleport(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void teleport(Player player) {
        this.x = player.x;
        this.y = player.y;
        this.z = player.z;
    }
    
    public void attack(Player player, int damage) {
        player.hp -= damage;
        if (player.hp < 0) {
            player.hp = 0;
        }
        this.hp += (damage / 2);
    }
    
    // Additional Methods
    public double getDistance(int x, int y, int z) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z, 2));
    }
    
    public double getDistance(Player player) {
        return Math.sqrt(Math.pow(this.x - player.x, 2) + Math.pow(this.y - player.y, 2) + Math.pow(this.z - player.z, 2));
    }
}
