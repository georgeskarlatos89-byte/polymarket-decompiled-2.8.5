package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class iqa extends qqa {
    public abstract Object a();

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof lqa) {
            obj = "\"" + ((Object) ((lqa) this).a) + '\"';
        } else {
            obj = a().toString();
        }
        return m51.m(sb, obj, ')');
    }
}
