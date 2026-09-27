package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class zo8 implements yci {
    public final SQLiteProgram a;

    public zo8(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // defpackage.yci
    public final void G0(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.yci
    public final void T0(double d, int i) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.yci
    public final void l(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.yci
    public final void l0(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // defpackage.yci
    public final void m(int i) {
        this.a.bindNull(i);
    }
}
