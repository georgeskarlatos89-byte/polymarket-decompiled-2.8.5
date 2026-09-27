package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfl9;", "Lv4j;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class fl9 extends v4j {
    public fl9() {
        super("ID token is required but missing", null);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return fl9.class.getSuperclass().getName() + ": " + getMessage();
    }
}
