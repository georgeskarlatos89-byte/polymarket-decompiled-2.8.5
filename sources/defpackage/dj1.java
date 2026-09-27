package defpackage;

import io.ably.lib.util.AgentHeaderCreator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dj1 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public dj1() {
        this.a = 3;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + AgentHeaderCreator.AGENT_DIVIDER + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dj1(long j, long j2, int i, byte b) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public dj1(int i, long j, long j2) {
        this.a = 1;
        this.b = j;
        this.c = j2;
    }
}
