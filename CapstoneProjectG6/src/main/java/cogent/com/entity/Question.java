package cogent.com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description_question;
    private String image_src;
    private String datetime;
    private String status;
    private String topics;
    private String title;
    private List<Answer> answers;
    @OneToOne
    private String qcreated_by;
    @OneToOne
    private String qapproved_by;
}
