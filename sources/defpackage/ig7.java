package defpackage;

import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ig7 {
    public static final Regex a;

    static {
        String pattern = new Regex("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])").a.pattern();
        pattern.getClass();
        a = new Regex(pattern.concat("|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])"));
    }
}
