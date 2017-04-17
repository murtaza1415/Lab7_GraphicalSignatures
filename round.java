package model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;

/**
 *
 * @author MuhammadMurtaza
 */
@Entity
public class round {
    @Id
    private int id;
    private String userId;
    private String scheme;
    private double time;
    private boolean state;
    private ArrayList<challenge> ChallengeList = new ArrayList<challenge>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public ArrayList<challenge> getChallengeList() {
        return ChallengeList;
    }

    public void setChallengeList(ArrayList<challenge> ChallengeList) {
        this.ChallengeList = ChallengeList;
    }
}
