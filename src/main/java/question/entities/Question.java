package question.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by frederic on 15/09/15.
 */
@Entity
@Table(name="QUESTION")
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="IDQUESTION")
    private int idquestion;
    @Column(name="QUESTION")
    private String question;
    @Column(name="REPONSE")
    private String reponse;
    @Column(name="TAGS")
    private String tags;
    @Column(name="CODE_QUESTION")
    private String code_question;
    @Column(name="CODE_REPONSE")
    private String code_reponse;
    @Column(name="QLEVEL")
    private int level;

    public Question(){
        super();
        idquestion=0;
    }

    public Question(int idquestion, String question, String reponse, String tags, String code_question, String code_reponse, int level) {
        super();
        this.idquestion = idquestion;
        this.question = question;
        this.reponse = reponse;
        this.tags = tags;
        this.code_question = code_question;
        this.code_reponse = code_reponse;
        this.level = level;
    }

    public long getIdquestion() {
        return idquestion;
    }

    public void setIdquestion(int idquestion) {
        this.idquestion = idquestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCode_question() {
        return code_question;
    }

    public void setCode_question(String code_question) {
        this.code_question = code_question;
    }

    public String getCode_reponse() {
        return code_reponse;
    }

    public void setCode_reponse(String code_reponse) {
        this.code_reponse = code_reponse;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString () {
        String temp="{";

        temp=temp+"id:"+this.idquestion;
        temp=temp+",question:"+this.question;
        temp=temp+",reponse:"+this.reponse;
        temp=temp+",code_question:"+this.code_question;
        temp=temp+",code_reponse:"+this.code_reponse;
        temp=temp+",level:"+this.level;
        temp=temp+",tags: :"+this.tags;
        temp=temp+"}";

        return temp;
    }
}
