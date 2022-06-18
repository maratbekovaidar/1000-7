defmodule DedInsult do
    def ded_insult(num) do
        if num > 7 do
          num1 = num - 7
          IO.puts to_string(num1) <> " - 7"
          ded_insult(num1)
        end
    end
end

DedInsult.ded_insult(1007)
IO.puts "I'am ghoul"