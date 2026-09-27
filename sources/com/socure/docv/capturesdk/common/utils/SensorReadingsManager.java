package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.analytics.model.Sensors;
import defpackage.dmk;
import defpackage.mrc;
import defpackage.orc;
import defpackage.u85;
import defpackage.vhn;
import defpackage.whn;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/SensorReadingsManager;", "", "Lcom/socure/docv/capturesdk/common/utils/AccelerometerManager;", "accelerometerManager", "Lcom/socure/docv/capturesdk/common/utils/GyroscopeManager;", "gyroscopeManager", "Lcom/socure/docv/capturesdk/common/utils/MagnetometerManager;", "magnetometerManager", "Lcom/socure/docv/capturesdk/core/provider/interfaces/d;", "", "timeProvider", "<init>", "(Lcom/socure/docv/capturesdk/common/utils/AccelerometerManager;Lcom/socure/docv/capturesdk/common/utils/GyroscopeManager;Lcom/socure/docv/capturesdk/common/utils/MagnetometerManager;Lcom/socure/docv/capturesdk/core/provider/interfaces/d;)V", "", "getTimestamp", "()Ljava/lang/String;", "Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;", "getSensorData", "()Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;", "", "calculate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "Lcom/socure/docv/capturesdk/common/utils/AccelerometerManager;", "Lcom/socure/docv/capturesdk/common/utils/GyroscopeManager;", "Lcom/socure/docv/capturesdk/common/utils/MagnetometerManager;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/d;", "lastProcessedTime", "J", "", "", "", "accData", "Ljava/util/List;", "gyroData", "magData", "sensorTimestamps", "Lmrc;", "mutex", "Lmrc;", "", "maxLength", "I", "getMaxLength", "()I", "setMaxLength", "(I)V", "processingInterval", "getProcessingInterval", "()J", "setProcessingInterval", "(J)V", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SensorReadingsManager {
    public static final int MAX_LENGTH = 40;
    public static final long PROCESSING_INTERVAL = 500;
    private final List<List<Float>> accData;
    private final AccelerometerManager accelerometerManager;
    private final List<List<Float>> gyroData;
    private final GyroscopeManager gyroscopeManager;
    private long lastProcessedTime;
    private final List<List<Float>> magData;
    private final MagnetometerManager magnetometerManager;
    private int maxLength;
    private final mrc mutex;
    private long processingInterval;
    private List<String> sensorTimestamps;
    private final com.socure.docv.capturesdk.core.provider.interfaces.d timeProvider;
    public static final int $stable = 8;

    public SensorReadingsManager(AccelerometerManager accelerometerManager, GyroscopeManager gyroscopeManager, MagnetometerManager magnetometerManager, com.socure.docv.capturesdk.core.provider.interfaces.d dVar) {
        accelerometerManager.getClass();
        gyroscopeManager.getClass();
        magnetometerManager.getClass();
        dVar.getClass();
        this.accelerometerManager = accelerometerManager;
        this.gyroscopeManager = gyroscopeManager;
        this.magnetometerManager = magnetometerManager;
        this.timeProvider = dVar;
        this.accData = new ArrayList();
        this.gyroData = new ArrayList();
        this.magData = new ArrayList();
        this.sensorTimestamps = new ArrayList();
        this.mutex = new orc();
        this.maxLength = 40;
        this.processingInterval = 500L;
    }

    public static final /* synthetic */ List access$getAccData$p(SensorReadingsManager sensorReadingsManager) {
        return sensorReadingsManager.accData;
    }

    public static final /* synthetic */ List access$getGyroData$p(SensorReadingsManager sensorReadingsManager) {
        return sensorReadingsManager.gyroData;
    }

    public static final /* synthetic */ List access$getMagData$p(SensorReadingsManager sensorReadingsManager) {
        return sensorReadingsManager.magData;
    }

    public static final /* synthetic */ mrc access$getMutex$p(SensorReadingsManager sensorReadingsManager) {
        return sensorReadingsManager.mutex;
    }

    public static final /* synthetic */ List access$getSensorTimestamps$p(SensorReadingsManager sensorReadingsManager) {
        return sensorReadingsManager.sensorTimestamps;
    }

    public static final /* synthetic */ void access$setLastProcessedTime$p(SensorReadingsManager sensorReadingsManager, long j) {
        sensorReadingsManager.lastProcessedTime = j;
    }

    private final String getTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        format.getClass();
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:11:0x005b, B:13:0x00c0, B:15:0x00e6, B:16:0x00ef, B:18:0x00f7, B:20:0x011d, B:21:0x0122, B:23:0x012a, B:25:0x0150, B:26:0x0155, B:28:0x0168, B:29:0x016d), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:11:0x005b, B:13:0x00c0, B:15:0x00e6, B:16:0x00ef, B:18:0x00f7, B:20:0x011d, B:21:0x0122, B:23:0x012a, B:25:0x0150, B:26:0x0155, B:28:0x0168, B:29:0x016d), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012a A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:11:0x005b, B:13:0x00c0, B:15:0x00e6, B:16:0x00ef, B:18:0x00f7, B:20:0x011d, B:21:0x0122, B:23:0x012a, B:25:0x0150, B:26:0x0155, B:28:0x0168, B:29:0x016d), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:11:0x005b, B:13:0x00c0, B:15:0x00e6, B:16:0x00ef, B:18:0x00f7, B:20:0x011d, B:21:0x0122, B:23:0x012a, B:25:0x0150, B:26:0x0155, B:28:0x0168, B:29:0x016d), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculate(Continuation<? super Unit> continuation) {
        SensorReadingsManager$calculate$1 sensorReadingsManager$calculate$1;
        int i;
        mrc mrcVar;
        long j;
        try {
            if (continuation instanceof SensorReadingsManager$calculate$1) {
                sensorReadingsManager$calculate$1 = (SensorReadingsManager$calculate$1) continuation;
                int i2 = sensorReadingsManager$calculate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sensorReadingsManager$calculate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sensorReadingsManager$calculate$1.result;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = sensorReadingsManager$calculate$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            j = sensorReadingsManager$calculate$1.J$0;
                            mrc mrcVar2 = (mrc) sensorReadingsManager$calculate$1.L$1;
                            SensorReadingsManager sensorReadingsManager = (SensorReadingsManager) sensorReadingsManager$calculate$1.L$0;
                            ResultKt.a(obj);
                            mrcVar = mrcVar2;
                            this = sensorReadingsManager;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        long longValue = ((Number) this.timeProvider.get()).longValue();
                        mrcVar = this.mutex;
                        sensorReadingsManager$calculate$1.L$0 = this;
                        sensorReadingsManager$calculate$1.L$1 = mrcVar;
                        sensorReadingsManager$calculate$1.J$0 = longValue;
                        sensorReadingsManager$calculate$1.label = 1;
                        if (mrcVar.e(sensorReadingsManager$calculate$1) == u85Var) {
                            return u85Var;
                        }
                        j = longValue;
                    }
                    this.lastProcessedTime = j;
                    Triple<Float, Float, Float> accelerometerValues = this.accelerometerManager.getAccelerometerValues();
                    float floatValue = ((Number) accelerometerValues.first).floatValue();
                    float floatValue2 = ((Number) accelerometerValues.second).floatValue();
                    float floatValue3 = ((Number) accelerometerValues.third).floatValue();
                    Triple<Float, Float, Float> gyroscopeValues = this.gyroscopeManager.getGyroscopeValues();
                    float floatValue4 = ((Number) gyroscopeValues.first).floatValue();
                    float floatValue5 = ((Number) gyroscopeValues.second).floatValue();
                    float floatValue6 = ((Number) gyroscopeValues.third).floatValue();
                    Triple<Float, Float, Float> magnetometerValues = this.magnetometerManager.getMagnetometerValues();
                    float floatValue7 = ((Number) magnetometerValues.first).floatValue();
                    float floatValue8 = ((Number) magnetometerValues.second).floatValue();
                    float floatValue9 = ((Number) magnetometerValues.third).floatValue();
                    if (this.accelerometerManager.isAvailable()) {
                        this.accData.add(CollectionsKt.listOf(new Float(floatValue), new Float(floatValue2), new Float(floatValue3)));
                        if (this.accData.size() > this.maxLength) {
                            this.accData.remove(0);
                        }
                    }
                    if (this.gyroscopeManager.isAvailable()) {
                        this.gyroData.add(CollectionsKt.listOf(new Float(floatValue4), new Float(floatValue5), new Float(floatValue6)));
                        if (this.gyroData.size() > this.maxLength) {
                            this.gyroData.remove(0);
                        }
                    }
                    if (this.magnetometerManager.isAvailable()) {
                        this.magData.add(CollectionsKt.listOf(new Float(floatValue7), new Float(floatValue8), new Float(floatValue9)));
                        if (this.magData.size() > this.maxLength) {
                            this.magData.remove(0);
                        }
                    }
                    this.sensorTimestamps.add(this.getTimestamp());
                    if (this.sensorTimestamps.size() > this.maxLength) {
                        this.sensorTimestamps.remove(0);
                    }
                    Unit unit = Unit.INSTANCE;
                    mrcVar.o(null);
                    return unit;
                }
            }
            this.lastProcessedTime = j;
            Triple<Float, Float, Float> accelerometerValues2 = this.accelerometerManager.getAccelerometerValues();
            float floatValue10 = ((Number) accelerometerValues2.first).floatValue();
            float floatValue22 = ((Number) accelerometerValues2.second).floatValue();
            float floatValue32 = ((Number) accelerometerValues2.third).floatValue();
            Triple<Float, Float, Float> gyroscopeValues2 = this.gyroscopeManager.getGyroscopeValues();
            float floatValue42 = ((Number) gyroscopeValues2.first).floatValue();
            float floatValue52 = ((Number) gyroscopeValues2.second).floatValue();
            float floatValue62 = ((Number) gyroscopeValues2.third).floatValue();
            Triple<Float, Float, Float> magnetometerValues2 = this.magnetometerManager.getMagnetometerValues();
            float floatValue72 = ((Number) magnetometerValues2.first).floatValue();
            float floatValue82 = ((Number) magnetometerValues2.second).floatValue();
            float floatValue92 = ((Number) magnetometerValues2.third).floatValue();
            if (this.accelerometerManager.isAvailable()) {
            }
            if (this.gyroscopeManager.isAvailable()) {
            }
            if (this.magnetometerManager.isAvailable()) {
            }
            this.sensorTimestamps.add(this.getTimestamp());
            if (this.sensorTimestamps.size() > this.maxLength) {
            }
            Unit unit2 = Unit.INSTANCE;
            mrcVar.o(null);
            return unit2;
        } catch (Throwable th) {
            mrcVar.o(null);
            throw th;
        }
        sensorReadingsManager$calculate$1 = new SensorReadingsManager$calculate$1(this, continuation);
        Object obj2 = sensorReadingsManager$calculate$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = sensorReadingsManager$calculate$1.label;
        if (i == 0) {
        }
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final long getProcessingInterval() {
        return this.processingInterval;
    }

    public final Sensors getSensorData() {
        return (Sensors) whn.b(g.a, new SensorReadingsManager$getSensorData$1(this, null));
    }

    public final void reset() {
        vhn.e(new SensorReadingsManager$reset$1(this, null));
    }

    public final void setMaxLength(int i) {
        this.maxLength = i;
    }

    public final void setProcessingInterval(long j) {
        this.processingInterval = j;
    }
}
