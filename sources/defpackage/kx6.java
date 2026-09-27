package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class kx6 {
    public static final LinkedHashMap a;

    static {
        Character ch;
        boolean z;
        Map e = d1c.e(new Pair('0', ".###.\n#...#\n#..##\n#.#.#\n##..#\n#...#\n.###."), new Pair('1', "..#..\n.##..\n..#..\n..#..\n..#..\n..#..\n.###."), new Pair('2', ".###.\n#...#\n....#\n...#.\n..#..\n.#...\n#####"), new Pair('3', "#####\n....#\n...#.\n..##.\n....#\n#...#\n.###."), new Pair('4', "...#.\n..##.\n.#.#.\n#..#.\n#####\n...#.\n...#."), new Pair('5', "#####\n#....\n####.\n....#\n....#\n#...#\n.###."), new Pair('6', ".###.\n#...#\n#....\n####.\n#...#\n#...#\n.###."), new Pair('7', "#####\n....#\n...#.\n..#..\n.#...\n.#...\n.#..."), new Pair('8', ".###.\n#...#\n#...#\n.###.\n#...#\n#...#\n.###."), new Pair('9', ".###.\n#...#\n#...#\n.####\n....#\n#...#\n.###."), new Pair('d', "....#\n....#\n.###.\n#...#\n#...#\n#...#\n.###."), new Pair('h', "#....\n#....\n####.\n#...#\n#...#\n#...#\n#...#"), new Pair('m', ".....\n.....\n#...#\n##.##\n#.#.#\n#...#\n#...#"), new Pair('s', ".....\n.....\n.###.\n#....\n.###.\n....#\n.###."));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(e.size()));
        for (Map.Entry entry : e.entrySet()) {
            Object key = entry.getKey();
            String s = e.s((String) entry.getValue(), "\n", "");
            boolean[] zArr = new boolean[35];
            for (int i = 0; i < 35; i++) {
                if (i >= 0 && i < s.length()) {
                    ch = Character.valueOf(s.charAt(i));
                } else {
                    ch = null;
                }
                if (ch != null && ch.charValue() == '#') {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
            linkedHashMap.put(key, zArr);
        }
        a = linkedHashMap;
    }
}
