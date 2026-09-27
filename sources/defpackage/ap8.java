package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ap8 extends zo8 implements cdi {
    public final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap8(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.b = sQLiteStatement;
    }

    @Override // defpackage.cdi
    public final long d0() {
        return this.b.executeInsert();
    }

    @Override // defpackage.cdi
    public final void execute() {
        this.b.execute();
    }

    @Override // defpackage.cdi
    public final int v() {
        return this.b.executeUpdateDelete();
    }
}
