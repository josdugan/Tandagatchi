package zipcode.tandagotchi.Models;

import javax.persistence.*;

/**
 * Created by lucky on 3/14/16.
 */
@Entity
@Table(name = "tandas")
public class Tanda {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int contributionAmount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(int contributionAmount) {
        this.contributionAmount = contributionAmount;
    }

}
