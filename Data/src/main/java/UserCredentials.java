public class UserCredentials {
    private String _login;
    private String _password;

    @Override
    public boolean equals(Object credentials)
            throws ClassCastException {
        UserCredentials creds = (UserCredentials) credentials;

        return _login.equals(creds._login)
                && _password.equals(creds._password);
    }
}