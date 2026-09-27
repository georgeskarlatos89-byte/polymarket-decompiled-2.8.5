package skip.lib;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/lib/TaskPriority;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(I)V", "getRawValue", "()Ljava/lang/Integer;", "equals", "", "other", "", "hashCode", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskPriority implements RawRepresentable<Integer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TaskPriority background;
    private static final TaskPriority high;
    private static final TaskPriority low;
    private static final TaskPriority medium;
    private static final TaskPriority userInitiated;
    private static final TaskPriority utility;
    private final int rawValue;

    static {
        TaskPriority taskPriority = new TaskPriority(25);
        high = taskPriority;
        medium = new TaskPriority(21);
        TaskPriority taskPriority2 = new TaskPriority(17);
        low = taskPriority2;
        userInitiated = taskPriority;
        utility = taskPriority2;
        background = new TaskPriority(9);
    }

    public TaskPriority(int i) {
        this.rawValue = i;
    }

    public static final /* synthetic */ TaskPriority access$getBackground$cp() {
        return background;
    }

    public static final /* synthetic */ TaskPriority access$getHigh$cp() {
        return high;
    }

    public static final /* synthetic */ TaskPriority access$getLow$cp() {
        return low;
    }

    public static final /* synthetic */ TaskPriority access$getMedium$cp() {
        return medium;
    }

    public static final /* synthetic */ TaskPriority access$getUserInitiated$cp() {
        return userInitiated;
    }

    public static final /* synthetic */ TaskPriority access$getUtility$cp() {
        return utility;
    }

    public boolean equals(Object other) {
        TaskPriority taskPriority;
        if (other instanceof TaskPriority) {
            taskPriority = (TaskPriority) other;
        } else {
            taskPriority = null;
        }
        if (taskPriority == null || getRawValue().intValue() != taskPriority.getRawValue().intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // skip.lib.RawRepresentable
    public Integer getRawValue() {
        return Integer.valueOf(this.rawValue);
    }

    public int hashCode() {
        return Integer.hashCode(getRawValue().intValue());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lskip/lib/TaskPriority$Companion;", "", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR, "Lskip/lib/TaskPriority;", "getHigh", "()Lskip/lib/TaskPriority;", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "getMedium", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR, "getLow", "userInitiated", "getUserInitiated", "utility", "getUtility", "background", "getBackground", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TaskPriority getBackground() {
            return TaskPriority.access$getBackground$cp();
        }

        public final TaskPriority getHigh() {
            return TaskPriority.access$getHigh$cp();
        }

        public final TaskPriority getLow() {
            return TaskPriority.access$getLow$cp();
        }

        public final TaskPriority getMedium() {
            return TaskPriority.access$getMedium$cp();
        }

        public final TaskPriority getUserInitiated() {
            return TaskPriority.access$getUserInitiated$cp();
        }

        public final TaskPriority getUtility() {
            return TaskPriority.access$getUtility$cp();
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Integer getRawValue() {
        return getRawValue();
    }
}
