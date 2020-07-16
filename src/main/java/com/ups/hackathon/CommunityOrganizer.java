public class CommunityOrganizer extends User {
    
    public CommunityOrganizer(String name, String address, String email, String skillA, String skillB, String skillC, String skillD, String skillE) {
        super(name, address, email, skillA, skillB, skillC, skillD, skillE);
    }
    public CommunityOrganizer(String name, String address, String email, String skillA, String skillB, String skillC, String skillD) {
        super(name, address, email, skillA, skillB, skillC, skillD);
    }
    public CommunityOrganizer(String name, String address, String email, String skillA, String skillB, String skillC) {
        super(name, address, email, skillA, skillB, skillC);
    }
    public CommunityOrganizer(String name, String address, String email, String skillA, String skillB) {
        super(name, address, email, skillA, skillB);
    }
    public CommunityOrganizer(String name, String address, String email, String skillA) {
        super(name, address, email, skillA);
    }
    public CommunityOrganizer(String name, String address, String email) {
        super(name, address, email);
    }

}