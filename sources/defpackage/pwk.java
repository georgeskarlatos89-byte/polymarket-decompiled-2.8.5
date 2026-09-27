package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class pwk {
    public static final String[] a = {"https://icanhazip.com", "https://checkip.amazonaws.com", "https://ipinfo.io/ip", "https://api64.ipify.org"};

    static {
        Pattern.compile("^(\\d{1,3}\\.){3}\\d{1,3}$");
        Pattern.compile("^[0-9a-fA-F:]+$");
    }
}
