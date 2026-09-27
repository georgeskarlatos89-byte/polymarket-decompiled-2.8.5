package defpackage;

import io.ably.lib.util.AgentHeaderCreator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class al5 extends bl5 {
    @Override // defpackage.bl5
    public final void b(StringBuilder sb) {
        sb.append('(');
        sb.append(this.a);
    }

    @Override // defpackage.bl5
    public final void c(StringBuilder sb) {
        sb.append(this.a);
        sb.append(']');
    }

    @Override // defpackage.bl5
    public final boolean d(Comparable comparable) {
        jnf jnfVar = jnf.c;
        if (this.a.compareTo(comparable) < 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bl5
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return AgentHeaderCreator.AGENT_DIVIDER + this.a + "\\";
    }
}
