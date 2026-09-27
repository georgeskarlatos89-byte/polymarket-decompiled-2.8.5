package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o0c {
    public static m0c a(Object obj, Object obj2) {
        m0c m0cVar = (m0c) obj;
        m0c m0cVar2 = (m0c) obj2;
        if (!m0cVar2.isEmpty()) {
            if (!m0cVar.a) {
                m0cVar = m0cVar.b();
            }
            m0cVar.a();
            if (!m0cVar2.isEmpty()) {
                m0cVar.putAll(m0cVar2);
            }
        }
        return m0cVar;
    }
}
