package com.developer.employes.managment.Entity;

import com.developer.employes.managment.Enum.EnumforProgrammer;
import jakarta.persistence.*;
import jdk.jfr.BooleanFlag;
import lombok.Data;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Data
@Table(name = "EntityProgramm")
public class EntityProgrammer {

    @Id
    @GeneratedValue
    @Column(unique = true, name = "id")
    private int id;
    @NotNull
    @Size(max = 20)
    @Column(name = "ProgrammerName")
    private String name;
    @Column(name = "ProgrammerAdress")
    private String Adress;
    @Column(name = "Birthday")
    // @DateTimeFormat(pattern="MM/dd/yyyy")
    //Date Tipusal is lehet
    private String Bday;
    @NotNull
    @Size(max = 20, message = "User.phone.number.is.invalid")
    @Pattern(regexp = "^(\\+\\d+)?([ -/]?\\d+){9,20}$", message = "User.phone.number.is.invalid")
    @Column(name = "PhoneNumber")
    private String PhoneNumber;
    @Size(max = 150)
    @Column(name = "Email", nullable = false)//@Column(unique = true)-Kérésre eltávolitva.
    @Pattern(regexp = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})$", message = "{user.email.invalid}")
    private String Email;
    @Column(name = "Projects")
    private String Projects;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "JobPosition")
    private EnumforProgrammer JobPosition;
    @NotNull
    @BooleanFlag
    @Column(name = "TraineeStatus")
    private boolean TraineeStatus;
    @BooleanFlag
    @NotNull
    private boolean Delete;



    public EntityProgrammer(int id, String name, String adress, String bday, String phoneNumber, String email, String projects, Enum jobPosition, Boolean traineeStatus) {
        this.id = id;
        this.name = name;
        this.Adress = adress;
        this.Bday = bday;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
        this.Projects = projects;
        this.TraineeStatus = traineeStatus;
        this.Delete = Delete;
        }


        public Boolean getDelete() {
        return Delete;
    }
        public void setDelete(Boolean delete) {
        Delete = delete;
    }

        public int getId() {
        return id;
    }
        public void setId(int id) {
        this.id = id;
    }

        public String getProjects() {
        return Projects;
    }
        public void setProjects(String projects) {
        Projects = projects;
    }

        public Enum getJobPosition() {
        return JobPosition;
    }
        public void setJobPosition(Enum jobPosition) {
        }

        public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }

        public String getAdress() {
        return Adress;
    }
        public void setAdress(String adress) {
        Adress = adress;
    }

        public String getBday() {
        return Bday;
    }
        public void setBday(String bday) {
        Bday = bday;
    }

        public String getPhoneNumber() {
        return PhoneNumber;
    }
        public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

        public String getEmail() {
        return Email;
    }
        public void setEmail(String email) {
        Email = email;
    }

        public Boolean getTraineeStatus() {
        return TraineeStatus;
    }
        public void setTraineeStatus(Boolean traineeStatus) {
        TraineeStatus = traineeStatus;
        }

        public boolean existsEntityProgrammerByEmail(String email) {
        return existsEntityProgrammerByEmail(getEmail());}

        public boolean isTraineeStatus(boolean traineeStatus) {
        return isTraineeStatus(getTraineeStatus());}
        }


