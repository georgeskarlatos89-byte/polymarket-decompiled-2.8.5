package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ssh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ssh[] $VALUES;
    public static final ssh FindFriends;
    public static final ssh Root;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ssh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ssh] */
    static {
        ?? r0 = new Enum("Root", 0);
        Root = r0;
        ?? r1 = new Enum("FindFriends", 1);
        FindFriends = r1;
        ssh[] sshVarArr = {r0, r1};
        $VALUES = sshVarArr;
        $ENTRIES = new wg7(sshVarArr);
    }

    public static ssh valueOf(String str) {
        return (ssh) Enum.valueOf(ssh.class, str);
    }

    public static ssh[] values() {
        return (ssh[]) $VALUES.clone();
    }
}
