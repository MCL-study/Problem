#include <stdio.h>
#include <windows.h>
#include <stdlib.h>
#include <conio.h>
#define MAX 1024
#define LEFT 75
#define RIGHT 77
#define UP 72
#define DOWN 80
#define ESC 27

void gotoxy(int x, int y);
struct Signal
{
	BOOL exist;                // 신호의 존재 여부
	char ch;                 // 출력할 문자
	int x, y;                   // 현재 좌표
	int distance;           // 이동할 거리
	int nFrame;                 // 속도
	int nStay;               // 속도에 대한 카운트
};
struct Signal S[MAX];
void main()
{
	int i;
	int ch;
	int freq = 15;
	int frame = 200;

	gotoxy(1, 23);
	printf("매트릭스 흉내내기. 상하:속도 증감, 좌우:빈도 증감, ESC:종료");

	for (;;) {
		gotoxy(60, 23);
		printf("속도:%d, 빈도:%d    ", frame, freq);

		// 키 입력 처리
		if (kbhit()) {
			ch = getch();
			if (ch == 0xE0) {
				ch = getch();
				switch (ch) {
				case UP:
					frame = min(frame + 10, 1000);
					break;
				case DOWN:
					frame = max(frame - 10, 10);
					break;
				case RIGHT:
					freq = max(freq - 1, 1);
					break;
				case LEFT:
					freq = min(freq + 1, 30);
					break;
				}
			}
			else {
				if (ch == ESC) {
					return;
				}
			}
		}

		// 새로운 신호 생성
		if (rand() % (freq + 1) == 0)
		{
			for (i = 0; i < MAX; i++) {
				if (S[i].exist == false) {
					S[i].exist = TRUE;
					S[i].ch = rand() % 26 + 'A';
					S[i].x = rand() % 81;
					S[i].y = 0;
					S[i].distance = rand() % 15 + 9;
					S[i].nFrame = S[i].nStay = rand() % 16 + 5;
					break;
				}
			}
			// 주기가 다 된 신호 이동 및 제거 처리
			for (i = 0; i < MAX; i++) {
				if (S[i].exist == FALSE)
					continue;
				if (--S[i].nStay == 0) {
					S[i].nStay = S[i].nFrame;
					gotoxy(S[i].x, S[i].y); putch(' ');
					if (++S[i].y < S[i].distance) {
						gotoxy(S[i].x, S[i].y); putch(S[i].ch);
					}
					else {
						S[i].exist = FALSE;
					}
				}
			}
			Sleep(1000 / frame);
		}
	}
}
void gotoxy(int x, int y)
{
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
