package domain;

import java.io.Serial;
import java.io.Serializable;

public class UserData implements Serializable {
    @Serial
    private static final long serialVersionUID = 127627793120698914L;
    private int id;
    private String title;
    private String context;

    public UserData() {
    }

    public UserData(int id, String title, String context) {
        this.id = id;
        this.title = title;
        this.context = context;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return context
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }

    public String toString() {
        return "UserData{id = " + id + ", title = " + title + ", context = " + context + "}";
    }
}
