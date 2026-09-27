package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c extends Lambda implements Function0 {
    public static final c h = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        int length = codecInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String name = codecInfos[i].getName();
            name.getClass();
            if (StringsKt.L(name, "c2.exynos", false)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
