package com.socure.docv.capturesdk.common.utils;

import android.graphics.Bitmap;
import defpackage.dmk;
import defpackage.mrc;
import defpackage.orc;
import defpackage.u85;
import defpackage.vhn;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "", "Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;", "varianceCalculator", "Lcom/socure/docv/capturesdk/core/provider/interfaces/d;", "", "timeProvider", "<init>", "(Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;Lcom/socure/docv/capturesdk/core/provider/interfaces/d;)V", "", "", "getVariances", "()Ljava/util/List;", "Landroid/graphics/Bitmap;", "previousBitmap", "currentBitmap", "", "calculate", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/d;", "", "variances", "Ljava/util/List;", "lastProcessedTime", "J", "Lmrc;", "mutex", "Lmrc;", "", "maxLength", "I", "getMaxLength", "()I", "setMaxLength", "(I)V", "processingInterval", "getProcessingInterval", "()J", "setProcessingInterval", "(J)V", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VarianceManager {
    public static final int MAX_VARIANCES = 40;
    public static final long VARIANCES_PROCESSING_INTERVAL = 500;
    private long lastProcessedTime;
    private int maxLength;
    private final mrc mutex;
    private long processingInterval;
    private final com.socure.docv.capturesdk.core.provider.interfaces.d timeProvider;
    private final VarianceCalculator varianceCalculator;
    private final List<Float> variances;
    public static final int $stable = 8;

    public VarianceManager(VarianceCalculator varianceCalculator, com.socure.docv.capturesdk.core.provider.interfaces.d dVar) {
        varianceCalculator.getClass();
        dVar.getClass();
        this.varianceCalculator = varianceCalculator;
        this.timeProvider = dVar;
        this.variances = new ArrayList();
        this.mutex = new orc();
        this.maxLength = 40;
        this.processingInterval = 500L;
    }

    public static final /* synthetic */ mrc access$getMutex$p(VarianceManager varianceManager) {
        return varianceManager.mutex;
    }

    public static final /* synthetic */ List access$getVariances$p(VarianceManager varianceManager) {
        return varianceManager.variances;
    }

    public static final /* synthetic */ void access$setLastProcessedTime$p(VarianceManager varianceManager, long j) {
        varianceManager.lastProcessedTime = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculate(Bitmap bitmap, Bitmap bitmap2, Continuation<? super Unit> continuation) {
        VarianceManager$calculate$1 varianceManager$calculate$1;
        int i;
        mrc mrcVar;
        try {
            if (continuation instanceof VarianceManager$calculate$1) {
                varianceManager$calculate$1 = (VarianceManager$calculate$1) continuation;
                int i2 = varianceManager$calculate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    varianceManager$calculate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = varianceManager$calculate$1.result;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = varianceManager$calculate$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            mrc mrcVar2 = (mrc) varianceManager$calculate$1.L$3;
                            bitmap2 = (Bitmap) varianceManager$calculate$1.L$2;
                            bitmap = (Bitmap) varianceManager$calculate$1.L$1;
                            VarianceManager varianceManager = (VarianceManager) varianceManager$calculate$1.L$0;
                            ResultKt.a(obj);
                            mrcVar = mrcVar2;
                            this = varianceManager;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        mrcVar = this.mutex;
                        varianceManager$calculate$1.L$0 = this;
                        varianceManager$calculate$1.L$1 = bitmap;
                        varianceManager$calculate$1.L$2 = bitmap2;
                        varianceManager$calculate$1.L$3 = mrcVar;
                        varianceManager$calculate$1.label = 1;
                        if (mrcVar.e(varianceManager$calculate$1) == u85Var) {
                            return u85Var;
                        }
                    }
                    if (bitmap.isRecycled() && !bitmap2.isRecycled()) {
                        this.variances.add(new Float(new Float(this.varianceCalculator.calculateMSE(bitmap, bitmap2)).floatValue()));
                        if (this.variances.size() > this.maxLength) {
                            this.variances.remove(0);
                        }
                    } else {
                        io.sentry.config.a.P("SDLT_VRM", "previousBitmap or currentBitmap is recycled", com.socure.docv.capturesdk.common.logger.a.E, null);
                    }
                    mrcVar.o(null);
                    return Unit.INSTANCE;
                }
            }
            if (bitmap.isRecycled()) {
            }
            io.sentry.config.a.P("SDLT_VRM", "previousBitmap or currentBitmap is recycled", com.socure.docv.capturesdk.common.logger.a.E, null);
            mrcVar.o(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mrcVar.o(null);
            throw th;
        }
        varianceManager$calculate$1 = new VarianceManager$calculate$1(this, continuation);
        Object obj2 = varianceManager$calculate$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = varianceManager$calculate$1.label;
        if (i == 0) {
        }
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final long getProcessingInterval() {
        return this.processingInterval;
    }

    public final List<Float> getVariances() {
        return CollectionsKt.M0(this.variances);
    }

    public final void reset() {
        vhn.e(new VarianceManager$reset$1(this, null));
    }

    public final void setMaxLength(int i) {
        this.maxLength = i;
    }

    public final void setProcessingInterval(long j) {
        this.processingInterval = j;
    }
}
