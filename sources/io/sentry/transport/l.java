package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l extends Authenticator {
    public final String a;
    public final String b;
    public final String c;

    public l(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY && this.c.equals(getRequestingHost())) {
            return new PasswordAuthentication(this.a, this.b.toCharArray());
        }
        return null;
    }
}
