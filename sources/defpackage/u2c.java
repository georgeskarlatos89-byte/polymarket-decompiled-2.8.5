package defpackage;

import kotlin.ranges.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class u2c {
    private static final /* synthetic */ u2c[] $VALUES;
    public static final u2c DEFAULT;
    public static final u2c DONE;
    public static final u2c DROP;
    public static final u2c NOTHING;

    static {
        u2c u2cVar = new u2c() { // from class: r2c
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
            @Override // defpackage.u2c
            public final void a(v0h v0hVar, aga agaVar) {
                agaVar.getClass();
                ykc ykcVar = (ykc) v0hVar.c;
                ykcVar.b.add(new wwg(new a(v0hVar.b, ykcVar.a, 1), agaVar));
            }
        };
        DONE = u2cVar;
        u2c u2cVar2 = new u2c() { // from class: s2c
            @Override // defpackage.u2c
            public final void a(v0h v0hVar, aga agaVar) {
                agaVar.getClass();
            }
        };
        DROP = u2cVar2;
        u2c u2cVar3 = new u2c() { // from class: q2c
            @Override // defpackage.u2c
            public final void a(v0h v0hVar, aga agaVar) {
                agaVar.getClass();
                throw new UnsupportedOperationException("Should not be invoked");
            }
        };
        DEFAULT = u2cVar3;
        u2c u2cVar4 = new u2c() { // from class: t2c
            @Override // defpackage.u2c
            public final void a(v0h v0hVar, aga agaVar) {
                agaVar.getClass();
            }
        };
        NOTHING = u2cVar4;
        $VALUES = new u2c[]{u2cVar, u2cVar2, u2cVar3, u2cVar4};
    }

    public static u2c valueOf(String str) {
        return (u2c) Enum.valueOf(u2c.class, str);
    }

    public static u2c[] values() {
        return (u2c[]) $VALUES.clone();
    }

    public abstract void a(v0h v0hVar, aga agaVar);
}
