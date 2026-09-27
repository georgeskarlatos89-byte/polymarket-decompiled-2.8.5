package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.feature.scanner.data.FrameGenerator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&R\u001e\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "", "getFrameGenerator", "Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGenerator;", "cropCoordinates", "", "", "getCropCoordinates", "()Ljava/util/List;", "clear", "", "freeze", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FeedManager {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static FrameGenerator getFrameGenerator(FeedManager feedManager) {
            return null;
        }
    }

    void clear();

    void freeze();

    List<List<Double>> getCropCoordinates();

    FrameGenerator getFrameGenerator();
}
