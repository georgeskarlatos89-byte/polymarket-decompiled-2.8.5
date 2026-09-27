package defpackage;

import io.ably.lib.util.AgentHeaderCreator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eq7 {
    public final long a;
    public final long b;

    public eq7(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final String toString() {
        return this.a + AgentHeaderCreator.AGENT_DIVIDER + this.b;
    }
}
