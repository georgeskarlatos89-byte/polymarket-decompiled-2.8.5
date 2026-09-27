package defpackage;

import com.google.android.libraries.places.internal.zzbsl;
import com.google.android.libraries.places.internal.zzbsm;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dmk implements kna {
    public static /* synthetic */ void A(String str) {
        throw new zzbsm(str);
    }

    public static /* synthetic */ void B(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void a() {
        throw new NoWhenBranchMatchedException();
    }

    public static void b(int i) {
        throw new IllegalArgumentException(ace.f(i, "An unknown field for index "));
    }

    public static /* synthetic */ void c(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Ran off end of other: 0, ");
        sb.append(i2);
        sb.append((Object) ", ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void f(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void j(Object obj, int i, int i2, Object obj2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void k(Object obj, int i, Object obj2, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void p() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void q(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void t() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void u(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void v(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void w() {
        throw new o8l();
    }

    public static /* synthetic */ void x(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void y() {
        throw new zzbsl("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void z(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.kna
    public l1n e(fxg fxgVar) {
        sff sffVar = (sff) fxgVar;
        if (sffVar.a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                gqk A = gqk.A(sffVar.c, mt7.a());
                if (A.y() == 0) {
                    return hqk.d(mqk.a(sffVar.e), new evf(pw1.a(A.x().f()), 1), sffVar.f);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (z7a unused) {
                fi9.r("Parsing XChaCha20Poly1305Key failed");
                return null;
            }
        }
        v("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        return null;
    }
}
