package ua.kek.dobriy_kot.diplomwork.models;



public class UserModel  {

    private int id;
    private String nickName;
    private int avatarUser;
    private String login;
    private String passwordUser;

    public UserModel() {
    }

    public UserModel(String nickName, int avatarUser, String login, String passsword) {
        this.nickName = nickName;
        this.avatarUser = avatarUser;
        this.login = login;
        this.passwordUser = passsword;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAvatarUser() {
        return avatarUser;
    }

    public void setAvatarUser(int avatarUser) {
        this.avatarUser = avatarUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
}
