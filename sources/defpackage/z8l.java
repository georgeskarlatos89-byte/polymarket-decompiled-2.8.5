package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z8l extends Exception {
    public final qw4 a;

    public z8l(qw4 qw4Var) {
        boolean z;
        if (qw4Var.b != 0 && qw4Var.c != null) {
            z = true;
        } else {
            z = false;
        }
        arn.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", z);
        this.a = qw4Var;
    }
}
