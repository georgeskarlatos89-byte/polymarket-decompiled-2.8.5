package kotlinx.coroutines.channels;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "SUSPEND", "DROP_OLDEST", "DROP_LATEST", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferOverflow {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ BufferOverflow[] $VALUES;
    public static final BufferOverflow DROP_LATEST;
    public static final BufferOverflow DROP_OLDEST;
    public static final BufferOverflow SUSPEND;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kotlinx.coroutines.channels.BufferOverflow] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kotlinx.coroutines.channels.BufferOverflow] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kotlinx.coroutines.channels.BufferOverflow] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        SUSPEND = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        DROP_OLDEST = r1;
        ?? r2 = new Enum("DROP_LATEST", 2);
        DROP_LATEST = r2;
        BufferOverflow[] bufferOverflowArr = {r0, r1, r2};
        $VALUES = bufferOverflowArr;
        $ENTRIES = new wg7(bufferOverflowArr);
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) $VALUES.clone();
    }
}
