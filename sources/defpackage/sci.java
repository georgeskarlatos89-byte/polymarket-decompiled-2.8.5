package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface sci extends Closeable {
    void B0(Object[] objArr);

    Cursor D0(zci zciVar, CancellationSignal cancellationSignal);

    void J();

    Cursor J0(String str);

    void L();

    void Q();

    boolean Y0();

    boolean d1();

    boolean isOpen();

    int k1(ContentValues contentValues, Object[] objArr);

    cdi o0(String str);

    void r();

    Cursor s(zci zciVar);

    void t(String str);

    void u0();
}
