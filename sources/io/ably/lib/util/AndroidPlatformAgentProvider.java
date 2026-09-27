package io.ably.lib.util;

import android.os.Build;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class AndroidPlatformAgentProvider implements PlatformAgentProvider {
    @Override // io.ably.lib.util.PlatformAgentProvider
    public String createPlatformAgent() {
        return "android/" + Build.VERSION.SDK_INT;
    }
}
