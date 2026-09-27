package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hsl {
    public static final gw7 a;
    public static final gw7 b;
    public static final gw7[] c;

    static {
        gw7 gw7Var = new gw7("GET_CREDENTIAL", 1L);
        a = gw7Var;
        gw7 gw7Var2 = new gw7("CREDENTIAL_REGISTRY", 1L);
        gw7 gw7Var3 = new gw7("CLEAR_REGISTRY", 2L);
        gw7 gw7Var4 = new gw7("CLEAR_CREATION_OPTIONS", 1L);
        gw7 gw7Var5 = new gw7("CLEAR_CREDENTIAL_STATE", 1L);
        gw7 gw7Var6 = new gw7("CREATE_CREDENTIAL", 3L);
        b = gw7Var6;
        c = new gw7[]{gw7Var, gw7Var2, gw7Var3, gw7Var4, gw7Var5, gw7Var6, new gw7("REGISTER_CREATION_OPTIONS", 1L), new gw7("REGISTER_EXPORT", 1L), new gw7("IMPORT_CREDENTIALS", 1L), new gw7("SIGNAL_CREDENTIAL_STATE", 1L), new gw7("CLEAR_EXPORT", 1L), new gw7("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new gw7("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new gw7("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
