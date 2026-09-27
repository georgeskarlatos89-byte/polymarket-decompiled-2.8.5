package kotlin.io;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileWalkDirection {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FileWalkDirection[] $VALUES;
    public static final FileWalkDirection BOTTOM_UP;
    public static final FileWalkDirection TOP_DOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kotlin.io.FileWalkDirection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kotlin.io.FileWalkDirection] */
    static {
        ?? r0 = new Enum("TOP_DOWN", 0);
        TOP_DOWN = r0;
        ?? r1 = new Enum("BOTTOM_UP", 1);
        BOTTOM_UP = r1;
        FileWalkDirection[] fileWalkDirectionArr = {r0, r1};
        $VALUES = fileWalkDirectionArr;
        $ENTRIES = new wg7(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) $VALUES.clone();
    }
}
