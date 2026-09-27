package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class a4l {
    public static final gw7 a;
    public static final gw7 b;
    public static final gw7[] c;

    static {
        gw7 gw7Var = new gw7("auth_api_credentials_begin_sign_in", 9L);
        gw7 gw7Var2 = new gw7("auth_api_credentials_sign_out", 2L);
        a = gw7Var2;
        gw7 gw7Var3 = new gw7("auth_api_credentials_authorize", 1L);
        gw7 gw7Var4 = new gw7("auth_api_credentials_revoke_access", 1L);
        gw7 gw7Var5 = new gw7("auth_api_credentials_save_password", 4L);
        gw7 gw7Var6 = new gw7("auth_api_credentials_get_sign_in_intent", 6L);
        b = gw7Var6;
        c = new gw7[]{gw7Var, gw7Var2, gw7Var3, gw7Var4, gw7Var5, gw7Var6, new gw7("auth_api_credentials_save_account_linking_token", 3L), new gw7("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
