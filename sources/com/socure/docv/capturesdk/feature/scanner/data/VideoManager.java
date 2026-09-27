package com.socure.docv.capturesdk.feature.scanner.data;

import com.socure.docv.capturesdk.common.utils.FeedManager;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;", "Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "frameGenerator", "Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGenerator;", "cropCoordinates", "", "", "<init>", "(Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGenerator;Ljava/util/List;)V", "getCropCoordinates", "()Ljava/util/List;", "clear", "", "getFrameGenerator", "freeze", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoManager implements FeedManager {
    public static final int $stable = 8;
    private final List<List<Double>> cropCoordinates;
    private final FrameGenerator frameGenerator;

    public VideoManager(FrameGenerator frameGenerator, List<List<Double>> list) {
        list.getClass();
        this.frameGenerator = frameGenerator;
        this.cropCoordinates = list;
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public List<List<Double>> getCropCoordinates() {
        return this.cropCoordinates;
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public FrameGenerator getFrameGenerator() {
        return null;
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public void clear() {
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public void freeze() {
    }
}
