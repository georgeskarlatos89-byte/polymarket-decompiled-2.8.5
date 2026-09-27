package io.intercom.android.sdk.logger;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LumberMill {
    private static final Twig MESSENGER_TWIG = new Twig(5, "Intercom", false);
    private static final Twig NEXUS_TWIG = new Twig(5, "Intercom realtime", false);
    private static final Twig ABLY_TWIG = new Twig(5, "Intercom Ably", false);
    private static final Twig BLOCK_TWIG = new Twig(5, "Intercom", false);

    public static Twig getAblyTwig() {
        return ABLY_TWIG;
    }

    public static Twig getBlocksTwig() {
        return BLOCK_TWIG;
    }

    public static Twig getLogger() {
        return MESSENGER_TWIG;
    }

    public static Twig getNexusTwig() {
        return NEXUS_TWIG;
    }

    public static void setLogLevel(@Intercom.LogLevel int i) {
        MESSENGER_TWIG.setLogLevel(i);
        NEXUS_TWIG.setLogLevel(i);
        ABLY_TWIG.setLogLevel(i);
        BLOCK_TWIG.setLogLevel(i);
    }
}
