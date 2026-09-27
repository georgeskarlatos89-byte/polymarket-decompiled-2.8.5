package io.sentry;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k5 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Runnable h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb.append(this.a);
        sb.append(", showName=");
        sb.append(this.b);
        sb.append(", isEmailRequired=");
        sb.append(this.c);
        sb.append(", showEmail=");
        sb.append(this.d);
        sb.append(", useSentryUser=");
        sb.append(this.e);
        sb.append(", showBranding=");
        sb.append(this.f);
        sb.append(", useShakeGesture=");
        return ix2.r(sb, this.g, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
    }
}
