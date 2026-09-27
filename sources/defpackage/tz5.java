package defpackage;

import java.util.function.Predicate;
import org.webrtc.DefaultBlacklistedVideoDecoderFactory;
import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class tz5 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return DefaultBlacklistedVideoDecoderFactory.a((VideoDecoder) obj);
    }
}
