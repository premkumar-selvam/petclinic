package springpetclinic.petclinic.Model;

import java.time.LocalDate;

public class Pet {
    private Pettype pettype;
    private Owner owner;
    private LocalDate birthDate;

    public Pettype getPettype() {
        return pettype;
    }

    public void setPettype(Pettype pettype) {
        this.pettype = pettype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
