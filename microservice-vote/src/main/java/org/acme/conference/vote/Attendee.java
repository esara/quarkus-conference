package org.acme.conference.vote;

import java.util.Objects;
import javax.validation.constraints.NotBlank;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

/**
 * Attendee entity
 * 
 * @author jzuriaga
 *
 */
public class Attendee extends PanacheMongoEntity {

    @NotBlank
    private String name;

    public String getId () {
        return id.toString();
    }

    public void setId (String id) {
        this.id = new ObjectId(id);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Attendee [id=" + getId() + ", name=" + name + "]";
    }

    @Override
    public int hashCode () {
        return Objects.hash(getId(), name);
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Attendee other = (Attendee) obj;
        if (!Objects.equals(this.id, other.id) || !Objects.equals(this.name, other.name))
            return false;
        return true;
    }

}
