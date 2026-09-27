package defpackage;

import io.ably.lib.util.AgentHeaderCreator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zk5 extends bl5 {
    public static final zk5 c = new zk5("", 0);
    public static final zk5 d = new zk5("", 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk5(Comparable comparable, int i) {
        super(comparable);
        this.b = i;
    }

    @Override // defpackage.bl5
    public int a(bl5 bl5Var) {
        switch (this.b) {
            case 0:
                if (bl5Var == this) {
                    return 0;
                }
                return 1;
            case 1:
                if (bl5Var == this) {
                    return 0;
                }
                return -1;
            default:
                return super.a(bl5Var);
        }
    }

    @Override // defpackage.bl5
    public final void b(StringBuilder sb) {
        switch (this.b) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.a);
                return;
        }
    }

    @Override // defpackage.bl5
    public final void c(StringBuilder sb) {
        switch (this.b) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.a);
                sb.append(')');
                return;
        }
    }

    @Override // defpackage.bl5, java.lang.Comparable
    public int compareTo(Object obj) {
        switch (this.b) {
            case 0:
                if (((bl5) obj) == this) {
                    return 0;
                }
                return 1;
            case 1:
                if (((bl5) obj) == this) {
                    return 0;
                }
                return -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override // defpackage.bl5
    public final boolean d(Comparable comparable) {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                jnf jnfVar = jnf.c;
                if (this.a.compareTo(comparable) > 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.bl5
    public final int hashCode() {
        switch (this.b) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.a.hashCode();
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.a + AgentHeaderCreator.AGENT_DIVIDER;
        }
    }
}
