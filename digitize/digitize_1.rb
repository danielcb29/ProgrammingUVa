#digitize.rb
def digitize(n)
  pile = []
  while n!=0  
    m=n%10
    n=n/10
    pile.unshift(m)
  end 
  pile
end

puts digitize(123)

def digitize2(n)
  n.to_s.chars.map(&:to_i)
end
