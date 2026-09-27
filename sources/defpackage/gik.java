package defpackage;

import io.ably.lib.util.AgentHeaderCreator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gik {
    public final String a;
    public final fik b;

    public gik(String str, fik fikVar) {
        if (!str.isEmpty() && str.charAt(0) == '/') {
            if (str.endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                this.a = str;
                this.b = fikVar;
                return;
            } else {
                dmk.v("Path should end with a slash '/'");
                throw null;
            }
        }
        dmk.v("Path should start with a slash '/'.");
        throw null;
    }
}
