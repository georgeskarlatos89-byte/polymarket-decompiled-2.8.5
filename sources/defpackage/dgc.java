package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dgc {
    public final int endVersion;
    public final int startVersion;

    public dgc(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public void migrate(fcg fcgVar) {
        fcgVar.getClass();
        if (fcgVar instanceof qci) {
            migrate(((qci) fcgVar).a);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    public abstract void migrate(sci sciVar);
}
