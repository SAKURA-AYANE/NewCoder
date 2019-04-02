package Huawei;

import java.util.*;
import java.io.*;

public class Solution3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int[][][] map = new int[a][b][c];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < c; k++) {
					map[i][j][k] = in.nextInt();
				}
			}
		}

		System.out.print(pass(a - 1, b - 1, c - 1, map));

	}

	public static int pass(int x, int y, int z, int[][][] map) {
		if (map[x][y][z] == 0) {
			System.out.println("aaa");
			if (x == 0) {
				if (y == 0) {
					if (z == 0) {
						return 0;
					} else {
						if (pass(x, y, z - 1, map) >= 0) {
							return pass(x, y, z - 1, map) + 1;
						}
					}
				} else {
					if (z == 0) {
						if (pass(x, y - 1, z, map) >= 0) {
							return pass(x, y - 1, z, map) + 1;
						}
					} else {
						if (pass(x, y - 1, z, map) >= 0) {
							if (pass(x, y, z - 1, map) >= 0) {
								return Math.min(pass(x, y - 1, z, map), pass(x, y, z - 1, map)) + 1;
							} else {
								return pass(x, y - 1, z, map) + 1;
							}
						} else {
							if (pass(x, y, z - 1, map) >= 0) {
								return pass(x, y, z - 1, map) + 1;
							}
						}
					}
				}

			} else {
				if (y == 0) {
					if (z == 0) {
						if (pass(x - 1, y, z, map) >= 0) {
							return pass(x - 1, y, z, map) + 1;
						}
					} else {
						if (pass(x - 1, y, z, map) >= 0) {
							if (pass(x, y, z - 1, map) >= 0) {
								return Math.min(pass(x - 1, y, z, map), pass(x, y, z - 1, map)) + 1;
							} else {
								return pass(x - 1, y, z, map) + 1;
							}
						} else {
							if (pass(x, y, z - 1, map) >= 0) {
								return pass(x, y, z - 1, map) + 1;
							}
						}
					}
				} else {
					if (z == 0) {
						if (pass(x, y - 1, z, map) >= 0) {
							if (pass(x - 1, y, z, map) >= 0) {
								return Math.min(pass(x, y - 1, z, map), pass(x - 1, y, z, map)) + 1;
							} else {
								return pass(x, y - 1, z, map) + 1;
							}
						} else {
							if (pass(x - 1, y, z, map) >= 0) {
								return pass(x - 1, y, z, map) + 1;
							}
						}
					} else {
						if (pass(x, y - 1, z, map) >= 0) {
							if (pass(x, y, z - 1, map) >= 0) {
								if (pass(x - 1, y, z, map) >= 0) {
									int temp = Math.min(pass(x, y - 1, z, map), pass(x, y, z - 1, map));
									return Math.min(pass(x - 1, y, z, map), temp) + 1;
								} else {
									return Math.min(pass(x, y - 1, z, map), pass(x, y, z - 1, map)) + 1;
								}
							}
						} else if (pass(x, y, z - 1, map) >= 0) {
							if (pass(x - 1, y, z, map) >= 0) {
								return Math.min(pass(x - 1, y, z, map), pass(x, y, z - 1, map)) + 1;
							} else {
								return pass(x, y, z - 1, map) + 1;
							}
						} else {
							if (pass(x - 1, y, z, map) >= 0) {
								return pass(x-1, y, z, map) + 1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
}
