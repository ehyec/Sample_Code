CC = gcc
INCLUDES =
CFLAGS = -g -Wall $(INCLUDES)
LDFLAGS = -g
LDLIBS = -lm
EXECUTABLE = test1

$(EXECUTABLE): test1.o list1.o
	$(CC) $(LDFLAGS) $^ $(LDLIBS) -o $@

test1.o: test1.c list1.h

list1.o: list1.c list1.h

.PHONY: clean
clean:
	rm -f *.o a.out core test1

